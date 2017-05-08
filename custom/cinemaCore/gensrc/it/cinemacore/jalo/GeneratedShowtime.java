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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import it.cinemacore.constants.CinemaCoreConstants;
import it.cinemacore.jalo.Cinema;
import it.cinemacore.jalo.Movie;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Showtime}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShowtime extends GenericItem
{
	/** Qualifier of the <code>Showtime.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Showtime.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Showtime.movie</code> attribute **/
	public static final String MOVIE = "movie";
	/** Qualifier of the <code>Showtime.Cinema</code> attribute **/
	public static final String CINEMA = "Cinema";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CINEMA's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedShowtime> CINEMAHANDLER = new BidirectionalOneToManyHandler<GeneratedShowtime>(
	CinemaCoreConstants.TC.SHOWTIME,
	false,
	"Cinema",
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
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(MOVIE, AttributeMode.INITIAL);
		tmp.put(CINEMA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.Cinema</code> attribute.
	 * @return the Cinema
	 */
	public Cinema getCinema(final SessionContext ctx)
	{
		return (Cinema)getProperty( ctx, CINEMA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.Cinema</code> attribute.
	 * @return the Cinema
	 */
	public Cinema getCinema()
	{
		return getCinema( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.Cinema</code> attribute. 
	 * @param value the Cinema
	 */
	public void setCinema(final SessionContext ctx, final Cinema value)
	{
		CINEMAHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.Cinema</code> attribute. 
	 * @param value the Cinema
	 */
	public void setCinema(final Cinema value)
	{
		setCinema( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CINEMAHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.movie</code> attribute.
	 * @return the movie
	 */
	public Movie getMovie(final SessionContext ctx)
	{
		return (Movie)getProperty( ctx, MOVIE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Showtime.movie</code> attribute.
	 * @return the movie
	 */
	public Movie getMovie()
	{
		return getMovie( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.movie</code> attribute. 
	 * @param value the movie
	 */
	public void setMovie(final SessionContext ctx, final Movie value)
	{
		setProperty(ctx, MOVIE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Showtime.movie</code> attribute. 
	 * @param value the movie
	 */
	public void setMovie(final Movie value)
	{
		setMovie( getSession().getSessionContext(), value );
	}
	
}
