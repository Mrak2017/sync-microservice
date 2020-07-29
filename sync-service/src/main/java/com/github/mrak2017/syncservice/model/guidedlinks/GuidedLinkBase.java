package com.github.mrak2017.syncservice.model.guidedlinks;

import com.github.mrak2017.syncservice.model.BaseEntity;
import com.github.mrak2017.syncservice.model.GuidedEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "link_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "snc_guided_link_base")
public class GuidedLinkBase extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "guided_entity_id", nullable = false)
    @NotNull
    private GuidedEntity guidedEntity;
}
