package com.rush.logistic.client.order_delivery.domain.deliveryman.domain;

// TODO : validation

import com.rush.logistic.client.order_delivery.global.common.BaseAudit;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLRestriction;

import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * user 중 role 이 deliveryman 인 사용자에 대해 deliveryman 에 대한 속성을 저장하는 엔티티
 */
@Builder
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name="p_deliveryman")
@SQLRestriction("is_delete = false")
public class Deliveryman extends BaseAudit {

    // 혹시 몰라 만들어두는 고유값 필드 (로직에서 되도록 사용은 안하고 구현 예정)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name="deliveryman_id", updatable = false, nullable = false)
    private UUID id;

    @Id
    @Column(updatable = false, nullable = false)
    private Long userId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DeliverymanInChargeEnum type;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DeliverymanStatusEnum status;

    @Column(nullable = false)
    private Integer sequence;

    private UUID hubInChargeId;

    private UUID lastHubId;

    private ZonedDateTime lastDeliveryTime;
}
