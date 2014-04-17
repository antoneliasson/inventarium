package se.antoneliasson.inventarium.models;

public class GTIN {
    private long gtin;

    public GTIN(long gtin) {
        this.gtin = gtin;
    }

    public long getGtin() {
        return gtin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.gtin ^ (this.gtin >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GTIN other = (GTIN) obj;
        if (this.gtin != other.gtin) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GTIN{" + "gtin=" + gtin + '}';
    }
    
}
