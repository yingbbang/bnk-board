package kr.co.bnk.board.dto;

public record BoardRequest(
        String title,
        String content,
        String name

) {
}
