import React, { useState } from 'react'
import Home from './NoHome/Home';
import CreateUser from './Create User/CreateUser';
import AllUsers from './AllUser/AllUsers';

function Children() {
var show;
 const [page,setPage] = useState("Home");
 
 const pageHandler = (page) =>{
    setPage(page);
 }
 if(page === "Home"){
    show=<Home pageHandler={pageHandler}/>
 }else if(page === "CreateUsers"){
    show=<CreateUser pageHandler={pageHandler}/>
 }else if(page === "AllUsers"){
    show = <AllUsers pageHandler={pageHandler}/>
 }

  return (
    <div>{show}</div>
  )
}

export default Children