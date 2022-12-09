import React, { useState }  from 'react'

function UserForm(props) {

  const [subData, setSubData] = useState({
    firstName: "",
    lastName: "",
    phoneNumber: "",
    email: ""
  })
  
  
  const handleChange = e =>{
    setSubData({...subData, [e.target.name]: e.target.value})
  }
  
  console.log(subData.firstName);

  return (
    <div>
      <form>

      <label>First Name: </label>
      <input type="text" name="firstName" value={subData.firstName} onChange={handleChange}></input> <br/>
      
      <label>Last Name: </label>
      <input type="text" name="lastName" value={subData.lastName} onChange={handleChange}></input> <br/>

      <label>Phone number: </label>
      <input type="text" name="phoneNumber" value={subData.phoneNumber} onChange={handleChange}></input> <br/>

      <label>Email: </label>
      <input type="email" name="email" value={subData.email} onChange={handleChange}></input> <br/>

      </form>
    </div>
  )
}

export default UserForm