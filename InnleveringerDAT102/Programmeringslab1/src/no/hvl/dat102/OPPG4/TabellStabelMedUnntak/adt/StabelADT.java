package no.hvl.dat102.OPPG4.TabellStabelMedUnntak.adt;

import no.hvl.dat102.OPPG4.TabellStabelMedUnntak.exception.EmptyCollectionException;

public interface StabelADT<T> {

	/*
	 * Definerer interface til en datastruktur stabel.
	 * //****************************************************************
	 */
	/**
	 * Legger til et element på toppen av stabelen, utvider hvis behov
	 * 
	 * @param element generisk element som stables på
	 */
	public void push(T element);

	/**
	 * Fjerner et element på toppen av stabelen og returnerer referansen Kaster
	 * unntak EmptyCollectionException hvis stabelen allerede er tom.
	 * 
	 * @return T element fjernes fra toppen av stabelen
	 * 
	 */
	public T pop();

	/**
	 * Returenerer referansen til elementet på toppen av stabelen. Elementet blir
	 * ikke fjernet. Kaster unntaket EmptyCollectionException hvis stabelen allerde
	 * er tom.
	 * 
	 */
	public T peek();

	/**
	 * Bestemmer om stabelen er full.
	 * 
	 * @return sann hvis tom stabel
	 */
	public boolean erTom();

	/**
	 * Returnerer antall elementer på stabelen.
	 * 
	 * @return antall elementer på stabelen
	 */
	public int antall();

}
