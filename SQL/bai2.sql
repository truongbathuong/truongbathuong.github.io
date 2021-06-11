SELECT rating, SUM(length), AVG(length)
FROM film
GROUP BY rating;

SELECT MAX(rental_rate), MIN(rental_rate)
FROM film;

SELECT country_id , COUNT(DISTINCT city)
FROM city
GROUP BY country_id;
