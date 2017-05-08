/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 8-mag-2017 17.47.47                         ---
 * ----------------------------------------------------------------
 */
package it.cinemacore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import it.cinemacore.constants.CinemaCoreConstants;
import it.cinemacore.jalo.Actor;
import it.cinemacore.jalo.Director;
import it.cinemacore.jalo.Productor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Movie}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMovie extends GenericItem
{
	/** Qualifier of the <code>Movie.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Movie.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Movie.genre</code> attribute **/
	public static final String GENRE = "genre";
	/** Qualifier of the <code>Movie.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>Movie.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>Movie.summary</code> attribute **/
	public static final String SUMMARY = "summary";
	/** Qualifier of the <code>Movie.director</code> attribute **/
	public static final String DIRECTOR = "director";
	/** Qualifier of the <code>Movie.productor</code> attribute **/
	public static final String PRODUCTOR = "productor";
	/** Qualifier of the <code>Movie.actors</code> attribute **/
	public static final String ACTORS = "actors";
	/** Relation ordering override parameter constants for ActorMovieRelation from ((cinemaCore))*/
	protected static String ACTORMOVIERELATION_SRC_ORDERED = "relation.ActorMovieRelation.source.ordered";
	protected static String ACTORMOVIERELATION_TGT_ORDERED = "relation.ActorMovieRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for ActorMovieRelation from ((cinemaCore))*/
	protected static String ACTORMOVIERELATION_MARKMODIFIED = "relation.ActorMovieRelation.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DIRECTOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMovie> DIRECTORHANDLER = new BidirectionalOneToManyHandler<GeneratedMovie>(
	CinemaCoreConstants.TC.MOVIE,
	false,
	"director",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCTOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMovie> PRODUCTORHANDLER = new BidirectionalOneToManyHandler<GeneratedMovie>(
	CinemaCoreConstants.TC.MOVIE,
	false,
	"productor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(GENRE, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		tmp.put(SUMMARY, AttributeMode.INITIAL);
		tmp.put(DIRECTOR, AttributeMode.INITIAL);
		tmp.put(PRODUCTOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.actors</code> attribute.
	 * @return the actors
	 */
	public Collection<Actor> getActors(final SessionContext ctx)
	{
		final List<Actor> items = getLinkedItems( 
			ctx,
			false,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.actors</code> attribute.
	 * @return the actors
	 */
	public Collection<Actor> getActors()
	{
		return getActors( getSession().getSessionContext() );
	}
	
	public long getActorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null
		);
	}
	
	public long getActorsCount()
	{
		return getActorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.actors</code> attribute. 
	 * @param value the actors
	 */
	public void setActors(final SessionContext ctx, final Collection<Actor> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTORMOVIERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.actors</code> attribute. 
	 * @param value the actors
	 */
	public void setActors(final Collection<Actor> value)
	{
		setActors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actors. 
	 * @param value the item to add to actors
	 */
	public void addToActors(final SessionContext ctx, final Actor value)
	{
		addLinkedItems( 
			ctx,
			false,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTORMOVIERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actors. 
	 * @param value the item to add to actors
	 */
	public void addToActors(final Actor value)
	{
		addToActors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actors. 
	 * @param value the item to remove from actors
	 */
	public void removeFromActors(final SessionContext ctx, final Actor value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTORMOVIERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actors. 
	 * @param value the item to remove from actors
	 */
	public void removeFromActors(final Actor value)
	{
		removeFromActors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DIRECTORHANDLER.newInstance(ctx, allAttributes);
		PRODUCTORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.director</code> attribute.
	 * @return the director
	 */
	public Director getDirector(final SessionContext ctx)
	{
		return (Director)getProperty( ctx, DIRECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.director</code> attribute.
	 * @return the director
	 */
	public Director getDirector()
	{
		return getDirector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.director</code> attribute. 
	 * @param value the director
	 */
	public void setDirector(final SessionContext ctx, final Director value)
	{
		DIRECTORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.director</code> attribute. 
	 * @param value the director
	 */
	public void setDirector(final Director value)
	{
		setDirector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENRE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre()
	{
		return getGenre( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENRE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final EnumerationValue value)
	{
		setGenre( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.productor</code> attribute.
	 * @return the productor
	 */
	public Productor getProductor(final SessionContext ctx)
	{
		return (Productor)getProperty( ctx, PRODUCTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.productor</code> attribute.
	 * @return the productor
	 */
	public Productor getProductor()
	{
		return getProductor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.productor</code> attribute. 
	 * @param value the productor
	 */
	public void setProductor(final SessionContext ctx, final Productor value)
	{
		PRODUCTORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.productor</code> attribute. 
	 * @param value the productor
	 */
	public void setProductor(final Productor value)
	{
		setProductor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.summary</code> attribute.
	 * @return the summary
	 */
	public String getSummary(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUMMARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.summary</code> attribute.
	 * @return the summary
	 */
	public String getSummary()
	{
		return getSummary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.summary</code> attribute. 
	 * @param value the summary
	 */
	public void setSummary(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUMMARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.summary</code> attribute. 
	 * @param value the summary
	 */
	public void setSummary(final String value)
	{
		setSummary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive()
	{
		return getTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final Integer value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final int value)
	{
		setTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final int value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYear( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive()
	{
		return getYearAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final Integer value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final int value)
	{
		setYear( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final int value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
