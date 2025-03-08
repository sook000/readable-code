## Day4 과제

1. 아래 코드와 설명을 보고, [섹션 3. 논리, 사고의 흐름]에서 이야기하는 내용을 중심으로 읽기 좋은 코드로 리팩토링해 봅시다.

✔️ 사용자가 생성한 '주문'이 유효한지를 검증하는 메서드.

✔️ Order는 주문 객체이고, 필요하다면 Order에 추가적인 메서드를 만들어도 된다. (Order 내부의 구현을 구체적으로 할 필요는 없다.)

✔️ 필요하다면 메서드를 추출할 수 있다.

```java
public boolean validateOrder(Order order) {
    if (order.getItems().size() == 0) {
        log.info("주문 항목이 없습니다.");
        return false;
    } else {
        if (order.getTotalPrice() > 0) {
            if (!order.hasCustomerInfo()) {
                log.info("사용자 정보가 없습니다.");
                return false;
            } else {
                return true;
            }
        } else if (!(order.getTotalPrice() > 0)) {
            log.info("올바르지 않은 총 가격입니다.");
            return false;
        }
    }
    return true;
}
```

### 나의 리팩토링

```java
public class Order {
	private List<Items> items;
	
	public boolean notExistOrder() {
		return items.size() == 0;
	}
	
	public boolean hasTotalPrice() {
		int totalPrice = 0;
		for (Item item : items) {
			totalPrice += item.getPrice();
		}
		return totalPrice == 0;
	}
}

public class OutputHandler {
	public printSimpleMessageToLog(String message) {
		log.info(message);
	}
}

public boolean validateOrder(Order order) {
    if (order.notExistOrder()) {
        printSimpleMessageToLog("주문 항목이 없습니다.");
        return false;
    } 
    if (order.**hasNotCustomerInfo()**) {
        printSimpleMessageToLog("사용자 정보가 없습니다.");
        return false;
    }
    if (order**.hasNotTotalPrice()**) {
        printSimpleMessageToLog**("올바르지 않은 총 가격입니다.");
        return false;
    }
    return true;
}
```

2. SOLID에 대하여 **자기만의 언어로** 정리해 봅시다.
- 노션에 자세히 서술 (서빙 복제 로봇 비유)
