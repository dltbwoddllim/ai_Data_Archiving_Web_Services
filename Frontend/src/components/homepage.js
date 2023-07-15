import React, { useEffect, useState } from 'react';

const MainPage = ({ onArticleClick }) => {
  const [articles, setArticles] = useState([]);

  useEffect(() => {
    // Fetch articles from the API
    fetch('https://api.example.com/articles')
      .then(response => response.json())
      .then(data => setArticles(data.articles))
      .catch(error => console.error(error));
  }, []);

  return (
    <div className="main-page">
      <h1>AI News</h1>
      <ul>
        {articles.map((article, index) => (
          <li key={index} onClick={() => onArticleClick(article)}>
            <h2>{article.title}</h2>
            <p>{article.summary}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default MainPage;