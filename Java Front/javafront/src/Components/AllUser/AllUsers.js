import React, { useEffect, useState } from "react";
import UserGroup from "./UserGroup";
import axios from "axios";

function AllUsers(props) {

  const [users, setUsers]=useState([]);

  /*const requestAPI = async () => {
    try {
      const res = await axios.get(`http://localhost:8080/users/`).then(response => setUsers(response.data));
    } catch (err) {
    }
  };*/

  const fetchApi = async () =>{
    const { data } = await axios.get("http://localhost:8080/users/");
    setUsers(data);
   }

   useEffect(() => {
    fetchApi();
   }, [])

  const goBackHome = () => {
    props.pageHandler("Home");
  };

  console.log(users);
  return (
    <div>
      <UserGroup myusers={users}></UserGroup>
      <div className="d-flex justify-content-center">
      <button onClick={goBackHome} className='btn btn-primary'>back</button>
      </div>
    </div>
  );
}

export default AllUsers;
