/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 8-mag-2017 18.33.48                         ---
 * ----------------------------------------------------------------
 */
package it.cinemacore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import it.cinemacore.constants.CinemaCoreConstants;
import it.cinemacore.jalo.Showtime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cinema}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCinema extends GenericItem
{
	/** Qualifier of the <code>Cinema.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Cinema.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Cinema.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>Cinema.showtimes</code> attribute **/
	public static final String SHOWTIMES = "showtimes";
	/**
	* {@link OneToManyHandler} for handling 1:n SHOWTIMES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Showtime> SHOWTIMESHANDLER = new OneToManyHandler<Showtime>(
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.showtimes</code> attribute.
	 * @return the showtimes
	 */
	public Collection<Showtime> getShowtimes(final SessionContext ctx)
	{
		return SHOWTIMESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cinema.showtimes</code> attribute.
	 * @return the showtimes
	 */
	public Collection<Showtime> getShowtimes()
	{
		return getShowtimes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.showtimes</code> attribute. 
	 * @param value the showtimes
	 */
	public void setShowtimes(final SessionContext ctx, final Collection<Showtime> value)
	{
		SHOWTIMESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cinema.showtimes</code> attribute. 
	 * @param value the showtimes
	 */
	public void setShowtimes(final Collection<Showtime> value)
	{
		setShowtimes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to showtimes. 
	 * @param value the item to add to showtimes
	 */
	public void addToShowtimes(final SessionContext ctx, final Showtime value)
	{
		SHOWTIMESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to showtimes. 
	 * @param value the item to add to showtimes
	 */
	public void addToShowtimes(final Showtime value)
	{
		addToShowtimes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from showtimes. 
	 * @param value the item to remove from showtimes
	 */
	public void removeFromShowtimes(final SessionContext ctx, final Showtime value)
	{
		SHOWTIMESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from showtimes. 
	 * @param value the item to remove from showtimes
	 */
	public void removeFromShowtimes(final Showtime value)
	{
		removeFromShowtimes( getSession().getSessionContext(), value );
	}
	
}
