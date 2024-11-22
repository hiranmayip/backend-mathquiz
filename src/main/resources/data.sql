-- Insert topics
INSERT INTO topic (name) VALUES ('Algebra');
INSERT INTO topic (name) VALUES ('Geometry');
INSERT INTO topic (name) VALUES ('Calculus');

-- Insert questions
INSERT INTO question (topic_id, question, answer, hint1, hint2)
VALUES (1, 'What is \\(x + x\\)?', '2x', 'Think of repeated addition.', 'x + x = x * 2');
