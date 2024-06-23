import React, { useState, useEffect } from 'react';
import axios from 'axios';  
import '../styles.css'; // Import your CSS file for styling
import Form from './Form';

function ListItem({ item, onItemClick }) {

  let notifiedText;
  let notifiedStyle = {}; // Style for the notified text
  
  if (item.notified) {
    notifiedText = 'Expired/Expiring';
    notifiedStyle.color = 'red'; // Set color to red
  } else {
    notifiedText = 'Not Expired';
  }
  return (
    <div className="list-item" onClick={() => onItemClick(item)}>
      <div className="item-name">{item.name}</div>
      <div className="item-date">{item.remaindDate}</div>
      <div className="item-date" style={notifiedStyle}>{notifiedText}</div>
    </div>
  );
}

function ListingPage() {
  const [items, setItems] = useState([]);
  const [showForm, setShowForm] = useState(false);

  useEffect(() => {
    fetchData(); // Fetch data when component mounts    
  }, []); 


  const fetchData = async () => {
    try {
      const response = await axios.get('http://localhost:8001/remainderservice/api/getRemainder'); // Replace '/api/getItems' with your actual endpoint
      setItems(response.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  const toggleForm = () => {
    setShowForm(!showForm);
  };

  const onItemClick = (item) => {
    // Handle click logic here,e.g., navigate to item details page  
    console.log('Clicked item:', item);
  };

  return (
    <div className="listing-container">
      {showForm && <div className="overlay"></div>}
      <div>
        <button className="list-button">List</button>
        <button className="add-button" onClick={toggleForm}>
          Add
        </button>
      </div>
      <h2>List of Items</h2>
      <div className="list">
        {items.map((item) => (
          <ListItem key={item.id} item={item} onItemClick={onItemClick} />
        ))}
      </div>
      {showForm && <Form onClose={toggleForm} />}
    </div>
  );
}

export default ListingPage;
