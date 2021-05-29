
Bài1:

SELECT first_name, last_name 
FROM `actor` 
ORDER BY last_name ASC

SELECT *
FROM `actor` 
WHERE last_name LIKE'd%'

Bài 2:

SELECT * FROM `film` 
WHERE rental_rate = 0.99 AND rating LIKE 'PG'

SELECT title, description,length,rental_rate 
FROM `film` 
WHERE (length BETWEEN 60 AND 90) AND (rental_rate = 0.99 OR 2.99)

SELECT title, description
FROM `film` 
WHERE (rental_duration < 6) AND (rating LIKE 'PG' OR 'PG-13')
ORDER BY title DESC