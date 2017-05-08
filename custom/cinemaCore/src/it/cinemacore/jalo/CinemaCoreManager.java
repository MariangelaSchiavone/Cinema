package it.cinemacore.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import it.cinemacore.constants.CinemaCoreConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CinemaCoreManager extends GeneratedCinemaCoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( CinemaCoreManager.class.getName() );
	
	public static final CinemaCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CinemaCoreManager) em.getExtension(CinemaCoreConstants.EXTENSIONNAME);
	}
	
}
