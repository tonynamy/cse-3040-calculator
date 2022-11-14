public interface CalculateComponent {
    public void addListener(CalculateListener l);

    public void removeListener(CalculateListener l);

    public void notifyListeners();
}
