import { useState, useEffect } from 'react';
//npm install axios for installing axios 

import axios from 'axios';

import { toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
  
const useRequest = (url) => {
  const [data, setData] = useState({});
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    axios
      .get(url)
      .then((result) => {
        setLoading(false);
        setData(result.data);
      })
      .catch((err) => {
        console.log(err);
        toast.error('Error loading data, check the spellings');
        setLoading(false);
      });
  }, [url]);

  return { data, loading };
};

export default useRequest;
