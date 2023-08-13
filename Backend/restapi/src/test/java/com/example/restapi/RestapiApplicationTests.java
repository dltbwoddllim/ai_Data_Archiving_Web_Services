package com.example.restapi.service;

import com.example.restapi.data.DAO.ArticleRepository;
import com.example.restapi.data.DAO.ArticlesRepository;
import com.example.restapi.data.DTO.ArticleDTO;
import com.example.restapi.data.DTO.ArticlesDTO;
import com.example.restapi.data.Entity.ArticleEntity;
import com.example.restapi.data.Entity.ArticlesEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringJUnitConfig
@SpringBootTest
public class RestapiApplicationTests {

	@Mock
	private ArticlesRepository articlesRepository;

	@Mock
	private ArticleRepository articleRepository;

	@Mock
	private ArticlesMapper articlesMapper;

	@Mock
	private ArticleMapper articleMapper;

	@InjectMocks
	private ArticleService articleService;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testGetLatestArticles() {
		// Arrange
		List<ArticlesEntity> articlesEntities = new ArrayList<>();
		// Add some mock data to articlesEntities

		when(articlesRepository.getLatestArticles()).thenReturn(articlesEntities);

		List<ArticlesDTO> articlesDTOs = new ArrayList<>();
		// Add some mock data to articlesDTOs

		when(articlesMapper.mapEntityListToDTOList(articlesEntities)).thenReturn(articlesDTOs);

		// Act
		String jsonResult = articleService.getLatestArticles();

		// Assert
		// Add your assertion here to check if the JSON result matches your expectations
	}

	@Test
	public void testGetArticle() {
		// Arrange
		Long articleId = 1L;
		ArticleEntity articleEntity = new ArticleEntity();
		// Set mock data in articleEntity

		when(articleRepository.getArticle(articleId)).thenReturn(articleEntity);

		ArticleDTO articleDTO = new ArticleDTO();
		// Set mock data in articleDTO

		when(articleMapper.mapEntityToDTO(articleEntity)).thenReturn(articleDTO);

		// Act
		String jsonResult = articleService.getArticle(articleId);

		// Assert
		// Add your assertion here to check if the JSON result matches your expectations
	}
}
