package com.example.restapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       //자동으로 get, set 매소드들이 만들어진다
@AllArgsConstructor     // 전체파라미터
@NoArgsConstructor      // 기본 생성자
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BookQueryParam {

    private String category;

    private String issuedYear;

    private String issuedMonth;

    private String issued_day;

}