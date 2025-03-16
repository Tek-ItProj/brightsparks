-- Create the documents/documents table (posts)
CREATE TABLE documents (
                             id SERIAL PRIMARY KEY,
                             title VARCHAR(255) NOT NULL,
                             description TEXT,
                             due_date TIMESTAMP,
                             created_at TIMESTAMP DEFAULT NOW(),
                             updated_at TIMESTAMP DEFAULT NOW()
);

-- Create the peer_reviews/comments table
CREATE TABLE peer_reviews (
                              id SERIAL PRIMARY KEY,
                              document_id INTEGER REFERENCES documents(id) ON DELETE CASCADE,
                              reviewer_name VARCHAR(255),
                              review_text TEXT,
                              rating INTEGER, -- Add a rating for peer reviews
                              created_at TIMESTAMP DEFAULT NOW(),
                              updated_at TIMESTAMP DEFAULT NOW()
);

-- Insert some sample documents
INSERT INTO documents (title, description, due_date) VALUES
                                                           ('Calculus I - Problem Set 3', 'Solve the following integrals and derivatives.', '2024-12-15 23:59:00'),
                                                           ('Programming document - Data Structures', 'Implement a binary search tree in Java.', '2024-12-20 23:59:00'),
                                                           ('Literature Analysis - Hamlet', 'Analyze the themes of revenge and madness in Hamlet.', '2024-12-22 23:59:00'),
                                                           ('Physics Lab Report - Optics', 'Write a lab report on the refraction of light.', '2024-12-24 23:59:00'),
                                                           ('History Essay - World War II', 'Discuss the causes and consequences of World War II.', '2024-12-26 23:59:00');

-- Insert some sample peer reviews for document 1
INSERT INTO peer_reviews (document_id, reviewer_name, review_text, rating) VALUES
                                                                                 (1, 'StudentA', 'Good attempt, but check your integration formulas.', 4),
                                                                                 (1, 'StudentB', 'Your explanations are clear, but some calculations are incorrect.', 3),
                                                                                 (1, 'Tutor1', 'Excellent work on the first few problems. Provide more detail on the last one.', 5);

-- Insert some sample peer reviews for document 2
INSERT INTO peer_reviews (document_id, reviewer_name, review_text, rating) VALUES
                                                                                 (2, 'StudentC', 'The code compiles, but the search function is inefficient.', 2),
                                                                                 (2, 'StudentD', 'Great job with the insertion and deletion methods!', 5),
                                                                                 (2, 'Tutor2', 'Remember to handle edge cases like empty trees.', 4);

-- Insert some sample peer reviews for document 3
INSERT INTO peer_reviews (document_id, reviewer_name, review_text, rating) VALUES
    (3, 'StudentE', 'Your analysis of Hamlets character is insightful.', 4),
    (3, 'StudentF', 'Consider exploring the role of fate in the play.', 3),
    (3, 'Professor1', 'Well written and organized. Youve captured the main themes effectively.', 5);

-- Insert some sample peer reviews for document 4
INSERT INTO peer_reviews (document_id, reviewer_name, review_text, rating) VALUES
                                                                                 (4, 'StudentG', 'Your data table is well-organized.', 4),
                                                                                 (4, 'StudentH', 'Did you account for the angle of incidence?', 3);

-- Insert some sample peer reviews for document 5
INSERT INTO peer_reviews (document_id, reviewer_name, review_text, rating) VALUES
                                                                                 (5, 'StudentI', 'Your essay is well-researched.', 5),
                                                                                 (5, 'StudentJ', 'Consider adding more primary sources.', 4);

-- Example select query to see documents and reviews.
SELECT a.id, a.title, a.description, pr.id as review_id, pr.reviewer_name, pr.review_text, pr.rating
FROM documents a
         LEFT JOIN peer_reviews pr ON a.id = pr.document_id;