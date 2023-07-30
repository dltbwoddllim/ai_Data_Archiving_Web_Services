import React, { useEffect, useState } from 'react';
import useReactTable from "@tanstack/react-table";

const MainPage = ({ onArticleClick }) => {
  const [articles, setArticles] = useState([]);

  useEffect(() => {
    // Fetch articles from the API
    fetch('http://localhost:8080/articles',{
      method: "GET", 
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': 'http://localhost:3000'       }
    })
      .then(response => response.json())
      .then(data => setArticles(data))
      .catch(error => console.error(error));
  }, []);

  const formatDate = date => {
    const formattedDate = new Date(date).toLocaleDateString();
    return formattedDate;
  };

  return (
    <div className="main-page">
      <h1>AI News</h1>
      <ul>
        {articles.map((article, index) => (
          <li key={index} onClick={() => onArticleClick(article)}>
            <h2>{article.articleTitle}</h2>
            <p>{article.articleSummary}</p>
            <p>URI: {article.articleUri}</p>
            <p>Date Added: {formatDate(article.dateAdded)}</p>
          </li>
        ))}
      </ul>
      <useReactTable/>
    </div>
  );
};

export default MainPage;
