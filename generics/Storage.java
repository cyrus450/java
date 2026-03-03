/* Step 1: Generic Class */
package generics;
class Storage<T> {
    // Private field of generic type
    private T item;
   // Store item
    void setItem(T item) {
        this.item = item;
    }
    // Retrieve item
    T getItem() {
        return item;
    }
}

