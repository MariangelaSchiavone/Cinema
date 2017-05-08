/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 8-mag-2017 13.23.07                         ---
 * ----------------------------------------------------------------
 */
package it.cinemacore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import it.cinemacore.constants.CinemaCoreConstants;
import it.cinemacore.jalo.Movie;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Actor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActor extends GenericItem
{
	/** Qualifier of the <code>Actor.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Actor.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Actor.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Actor.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>Actor.movies</code> attribute **/
	public static final String MOVIES = "movies";
	/** Relation ordering override parameter constants for ActorMovieRelation from ((cinemaCore))*/
	protected static String ACTORMOVIERELATION_SRC_ORDERED = "relation.ActorMovieRelation.source.ordered";
	protected static String ACTORMOVIERELATION_TGT_ORDERED = "relation.ActorMovieRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for ActorMovieRelation from ((cinemaCore))*/
	protected static String ACTORMOVIERELATION_MARKMODIFIED = "relation.ActorMovieRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.movies</code> attribute.
	 * @return the movies
	 */
	public Collection<Movie> getMovies(final SessionContext ctx)
	{
		final List<Movie> items = getLinkedItems( 
			ctx,
			true,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.movies</code> attribute.
	 * @return the movies
	 */
	public Collection<Movie> getMovies()
	{
		return getMovies( getSession().getSessionContext() );
	}
	
	public long getMoviesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null
		);
	}
	
	public long getMoviesCount()
	{
		return getMoviesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.movies</code> attribute. 
	 * @param value the movies
	 */
	public void setMovies(final SessionContext ctx, final Collection<Movie> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTORMOVIERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.movies</code> attribute. 
	 * @param value the movies
	 */
	public void setMovies(final Collection<Movie> value)
	{
		setMovies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to movies. 
	 * @param value the item to add to movies
	 */
	public void addToMovies(final SessionContext ctx, final Movie value)
	{
		addLinkedItems( 
			ctx,
			true,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTORMOVIERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to movies. 
	 * @param value the item to add to movies
	 */
	public void addToMovies(final Movie value)
	{
		addToMovies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from movies. 
	 * @param value the item to remove from movies
	 */
	public void removeFromMovies(final SessionContext ctx, final Movie value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CinemaCoreConstants.Relations.ACTORMOVIERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTORMOVIERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from movies. 
	 * @param value the item to remove from movies
	 */
	public void removeFromMovies(final Movie value)
	{
		removeFromMovies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final String value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
