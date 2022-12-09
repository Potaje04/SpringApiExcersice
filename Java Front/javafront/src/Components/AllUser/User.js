import React from 'react'

function User(props) {

  return (
    <div>
        <div className="d-flex justify-content-center border border-info">
        Name: {props.user.name}  
        Last Name: {props.user.lastName}  
        Phone Number: {props.user.phoneNumber}  
        Email: {props.user.email}
        </div>
    </div>
  )
}

export default User