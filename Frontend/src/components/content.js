import React from 'react';

const ContentPage = ({ article }) => {
  return (
    <div className="content-page">
      <h2>{article.title}</h2>
      <p>{article.summary}</p>
      <a href={article.uri} target="_blank" rel="noopener noreferrer">
      </a>
    </div>
  );
};

export default ContentPage;
