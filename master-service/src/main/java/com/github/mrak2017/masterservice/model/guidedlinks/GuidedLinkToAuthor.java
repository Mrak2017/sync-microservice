package com.github.mrak2017.masterservice.model.guidedlinks;

import com.github.mrak2017.masterservice.model.entity.Author;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@DiscriminatorValue("GuidedLinkToAuthor")
public class GuidedLinkToAuthor extends GuidedLinkBase {

    @OneToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}
