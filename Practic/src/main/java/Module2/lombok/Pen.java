package Module2.lombok;

import lombok.AllArgsConstructor;

/**
 * Created by PharuS on 19.12.2016.
 */
@AllArgsConstructor
public class Pen {
    private String penName;
    private int price;

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Pen)) return false;
        final Pen other = (Pen) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$penName = this.penName;
        final Object other$penName = other.penName;
        if (this$penName == null ? other$penName != null : !this$penName.equals(other$penName)) return false;
        if (this.price != other.price) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $penName = this.penName;
        result = result * PRIME + ($penName == null ? 43 : $penName.hashCode());
        result = result * PRIME + this.price;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Pen;
    }
}
