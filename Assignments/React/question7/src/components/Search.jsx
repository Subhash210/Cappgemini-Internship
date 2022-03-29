import React, { useState } from 'react';
//Here we are using
import styled from 'styled-components';

function Search({ setSearchResults }) {
  const [search, setSearch] = useState('');
  //Use State Will be String For this 

  const onSubmit = (e) => {
    e.preventDefault();
    //Calling it from the main use state we declared in our App.js
    setSearchResults(search);
    setSearch('');
  };

  console.log(search);
  return (
    <StyledSearch>
      <form onSubmit={onSubmit}>
        <input
          type='text'
          placeholder='Search your location and hit Enter'
          value={search}
  //Using OnChange Where we are using events so that u can make a callback so that we can set state to e.target.value
          onChange={(e) => setSearch(e.target.value)}
        />
      </form>
    </StyledSearch>
  );
}

const StyledSearch = styled.div`
  margin-bottom: 30px;
  input {
    width: 80%;
    height: 45px;
    border-radius: 10px;
    padding-left: 20px;
  }
`;

export default Search;
