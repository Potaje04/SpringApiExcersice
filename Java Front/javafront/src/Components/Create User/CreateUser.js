import React from 'react'
import UserForm from './UserForm';

function CreateUser(props) {

const goBackHome = () =>{
props.pageHandler("Home");
}

  return (
    <div>
        <div className="d-flex justify-content-center border border-info"><UserForm></UserForm> </div>
      <div className="d-flex justify-content-center border border-info"><button onClick={goBackHome} className='btn btn-primary'>back</button></div>
    </div>
  )
}

export default CreateUser
