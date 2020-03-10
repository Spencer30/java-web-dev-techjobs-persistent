## Part 1: Test it with SQL
SELECT *
FROM job;
## Part 2: Test it with SQL
SELECT *
FROM employer
WHERE location = 'Kansas City, MO';
## Part 3: Test it with SQL
DROP TABLE job
## Part 4: Test it with SQL
SELECT s.name,s.description, js.jobs_id
FROM skill s
LEFT JOIN job_skills js
	ON s.id = js.skills_id
WHERE jobs_id IS NOT NULL
ORDER BY name ASC