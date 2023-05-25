package com.hope.sps.zone.space;

import com.hope.sps.zone.Zone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "space")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Space {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number", nullable = false, length = 50)
    private Integer number;

    @Enumerated(EnumType.STRING)
    private State state = State.AVAILABLE;

    @ManyToOne(fetch = FetchType.LAZY)
    private Zone zone;

    public Space(Integer number) {
        this.number = number;
    }

    public Space(Long id) {
        this.id = id;
    }

    // for testing purposes
    public Space(long id, int number, State state) {
        this.id = id;
        this.number = number;
        this.state = state;
    }

    //delete
    public boolean isAvailable() {
        return this.state == State.AVAILABLE;
    }

    public enum State {
        AVAILABLE, TAKEN
    }

}
