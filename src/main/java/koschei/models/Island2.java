package koschei.models;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}

/**
 * 3) Бин Wood3 помечен как компонент,
 * который конструируется через связывание по @Autowired с помощью конструктора.
 */