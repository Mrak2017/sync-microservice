package com.github.mrak2017.syncservice.model.guidedlinks;

import com.github.mrak2017.syncservice.model.entity.Book;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@DiscriminatorValue("GuidedLinkToBook")
public class GuidedLinkToBook extends GuidedLinkBase {

    @OneToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
