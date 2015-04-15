package comp5134.util;

import java.util.ArrayList;

public class Observable {

	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	private boolean changed = false;
	
	
	public void registerObserver(Observer o){
		observerList.add(o);
	}
	
	public void notifyObservers(Object subject){
		
		if (!changed){
			return;
		}
		clearChanged();
		
		for (int i=0;i<observerList.size();i++){
			Observer ob = observerList.get(i);
			ob.update(this, subject);
		}
		
	}
	
	public void setChanged(){
		changed = true;
	}
	
	public void clearChanged(){
		changed = false;
	}
	
	public int countObservers(){
		return observerList.size();
	}
	
	public ArrayList<Observer> getObserverList(){
		return observerList;
	}
	
	
	
}
