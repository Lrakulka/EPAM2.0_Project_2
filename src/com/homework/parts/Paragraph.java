package com.homework.parts;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> sentences;

    public Paragraph(List<Sentence> sentences) {
	this.sentences = sentences;
    }
    
    public List<Sentence> getSentences() {
        return new ArrayList<>(sentences);
    }
    
}
