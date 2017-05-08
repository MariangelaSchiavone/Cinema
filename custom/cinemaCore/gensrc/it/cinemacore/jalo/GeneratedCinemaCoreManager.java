/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 8-mag-2017 18.33.48                         ---
 * ----------------------------------------------------------------
 */
package it.cinemacore.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import it.cinemacore.constants.CinemaCoreConstants;
import it.cinemacore.jalo.Actor;
import it.cinemacore.jalo.Cinema;
import it.cinemacore.jalo.Director;
import it.cinemacore.jalo.Movie;
import it.cinemacore.jalo.Productor;
import it.cinemacore.jalo.Showtime;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CinemaCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCinemaCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Actor createActor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CinemaCoreConstants.TC.ACTOR );
			return (Actor)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Actor : "+e.getMessage(), 0 );
		}
	}
	
	public Actor createActor(final Map attributeValues)
	{
		return createActor( getSession().getSessionContext(), attributeValues );
	}
	
	public Cinema createCinema(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CinemaCoreConstants.TC.CINEMA );
			return (Cinema)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Cinema : "+e.getMessage(), 0 );
		}
	}
	
	public Cinema createCinema(final Map attributeValues)
	{
		return createCinema( getSession().getSessionContext(), attributeValues );
	}
	
	public Director createDirector(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CinemaCoreConstants.TC.DIRECTOR );
			return (Director)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Director : "+e.getMessage(), 0 );
		}
	}
	
	public Director createDirector(final Map attributeValues)
	{
		return createDirector( getSession().getSessionContext(), attributeValues );
	}
	
	public Movie createMovie(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CinemaCoreConstants.TC.MOVIE );
			return (Movie)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Movie : "+e.getMessage(), 0 );
		}
	}
	
	public Movie createMovie(final Map attributeValues)
	{
		return createMovie( getSession().getSessionContext(), attributeValues );
	}
	
	public Productor createProductor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CinemaCoreConstants.TC.PRODUCTOR );
			return (Productor)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Productor : "+e.getMessage(), 0 );
		}
	}
	
	public Productor createProductor(final Map attributeValues)
	{
		return createProductor( getSession().getSessionContext(), attributeValues );
	}
	
	public Showtime createShowtime(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CinemaCoreConstants.TC.SHOWTIME );
			return (Showtime)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Showtime : "+e.getMessage(), 0 );
		}
	}
	
	public Showtime createShowtime(final Map attributeValues)
	{
		return createShowtime( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CinemaCoreConstants.EXTENSIONNAME;
	}
	
}
