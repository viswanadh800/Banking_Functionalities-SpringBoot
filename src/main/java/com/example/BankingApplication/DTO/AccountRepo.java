package com.example.BankingApplication.DTO;

import com.example.BankingApplication.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {
    @Query(value="Select balance from account",nativeQuery = true)
    public double getBalance();

//    @Query(value="SELECT * FROM Question Where Question.category=:category ORDER BY RANDOM() LIMIT:numQuestions",nativeQuery = true)
//    List<TypePatternQuestions.Question> findQustionsByCategoryAndNum(String category, int numQuestions);
}
