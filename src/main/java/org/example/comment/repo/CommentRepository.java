package org.example.comment.repo;

public interface CommentRepository extends org.springframework.data.jpa.repository.JpaRepository<org.example.comment.entity.Comment, java.lang.Integer> {
  }