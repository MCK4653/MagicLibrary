package edu.gitt.is.magiclibrary.model.entities;


import javax.persistence.Entity;

import java.sql.Date;

//import javax.persistence.DiscriminatorValue;
/**
 * <p>Entidad para almacenar los datos de una grabaci�n de audio.</p>
 * <p>Hereda de {@link edu.gitt.is.magiclibrary.model.entities.Title}, los datos particulares a la clase AudioRecord se guardan en una tabla, pero los comunes a Title se guardan en otra</p>
 * @author Isabel Rom�n
 * @version 0.0
 */

@Entity
//@DiscriminatorValue( value="AR" )

public class AudioRecord extends Title 
{
   /**
	 * A�adido n�mero de serie por defecto
	 */
   private static final long serialVersionUID = 1L;
   /**
    * Etiqueta
    */
   private String label;
   /**
    * Duraci�n de la grabaci�n
    */
   private int duration;
   /**
    * N�mero de pistas
    */
   private String tracks;
   /**
    * 
    * @param id identificador un�voco de la grabaci�n audio {@link edu.gitt.is.magiclibrary.model.entities.Title}
    * @param name Nombre	{@link edu.gitt.is.magiclibrary.model.entities.Title}
    * @param author Autor {@link edu.gitt.is.magiclibrary.model.entities.Title}
    * @param publishedAt Fecha de publicaci�n {@link edu.gitt.is.magiclibrary.model.entities.Title}
    * @param label Etiqueta
    * @param duration Duraci�n
    * @param tracks N�mero de Tracks
    */

   public AudioRecord(String id, String name, String author, Date publishedAt, String label,int duration, String tracks) 
   {
      super(id, name, author, publishedAt );
      this.label = label;
      this.duration = duration;
      this.tracks = tracks;
   }
   /**
    * 
    * @param name Nombre {@link edu.gitt.is.magiclibrary.model.entities.Title}
    * @param author Autor {@link edu.gitt.is.magiclibrary.model.entities.Title}
    * @param publishedAt Fecha de publicaci�n {@link edu.gitt.is.magiclibrary.model.entities.Title}
    * @param label Etiqueta
    * @param duration Duraci�n
    * @param tracks N�mero de Tracks
    */
   
   public AudioRecord( String name, String author, Date publishedAt, String label,int duration, String tracks) 
   {
      super( name, author, publishedAt );
      this.label = label;
      this.duration = duration;
      this.tracks = tracks;
   }
/**
 * Constructor simple
 */
   public AudioRecord( ) 
   {
      super( );
   }
/**
 * 
 * @return La etiqueta del AudioRecord
 */
   public String getLabel( )
   {
      return label;
   }
/**
 * 
 * @param label Etiqueta
 */
   public void setLabel( String label )
   {
      this.label = label;
   }
/**
 * 
 * @return Duraci�n de la grabaci�n
 */
   public int getDuration( ) 
   {
      return duration;
   }
/**
 * 
 * @param duration Duraci�n de la grabaci�n
 */
   public void setDuration( int duration )
   {
      this.duration = duration;
   }
   /**
    * Sobreescribo el m�todo toString para tener una representaci�n m�s clara del objeto al depurar
    */
	@Override
	public String toString() {
		return super.toString()+" AudioRecord[label= "+label+" duration= "+duration+" tracks= "+tracks+"]\n";
	
	}
}