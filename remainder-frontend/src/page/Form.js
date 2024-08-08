import React, { useState } from 'react';
import axios from 'axios';
import '../styles.css'; // Import your CSS file for form styling

function Form({ onClose }) {
  const [formData, setFormData] = useState({
    name: '',
    remaindDate: ''
  });
  const [error, setError] = useState(null);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
  };   
   
  const handleSave = async () => {
    try {
      console.log("abc");
      const response = await axios.post('http://localhost:8001/remainderservice/api/saveRemainder', formData);
      console.log('Form data saved successfully:', response.data);
      // Reset form fields 
      setFormData({
        name: '',
        remaindDate: ''
      });
      // Close the form
      onClose();
    } catch (error) {
      console.error('Error saving form data:', error);
      setError('Error saving form data. Please try again.');
    }
  };

  return (
    <div className="form-popup">
      <div className="form-content">
        <span className="close" onClick={onClose}>&times;</span>
        <h2>Add Item</h2>
        {error && <div className="error-message">{error}</div>}
        <div className="form-group">
          <label htmlFor="name">Name:</label>
          <input
            type="text"
            id="name"
            name="name"
            value={formData.name}
            onChange={handleInputChange}
            placeholder="Enter your name"
          />
        </div>
        <div className="form-group">
          <label htmlFor="date">Date:</label>
          <input
            type="date"
            id="remaindDate"
            name="remaindDate"
            value={formData.remaindDate}
            onChange={handleInputChange}
          />
        </div>
        <button onClick={handleSave}>Save</button>
      </div>
    </div>
  );
}

export default Form;
