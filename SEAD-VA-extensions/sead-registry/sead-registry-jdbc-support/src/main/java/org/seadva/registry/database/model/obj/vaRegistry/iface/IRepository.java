package org.seadva.registry.database.model.obj.vaRegistry.iface;
import java.util.Set;
import javax.persistence.Basic;
import org.seadva.registry.database.model.obj.vaRegistry.DataLocation;


/** 
 * Object interface mapping for hibernate-handled table: repository.
 * @author autogenerated
 */

public interface IRepository {



    /**
     * Return the value associated with the column: affiliation.
	 * @return A String object (this.affiliation)
	 */
	String getAffiliation();
	

  
    /**  
     * Set the value related to the column: affiliation.
	 * @param affiliation the affiliation value you wish to set
	 */
	void setAffiliation(final String affiliation);

    /**
     * Return the value associated with the column: dataLocation.
	 * @return A Set&lt;DataLocation&gt; object (this.dataLocation)
	 */
	Set<DataLocation> getDataLocations();
	
	/**
	 * Adds a bi-directional link of type DataLocation to the dataLocations set.
	 * @param dataLocation item to add
	 */
	void addDataLocation(DataLocation dataLocation);

  
    /**  
     * Set the value related to the column: dataLocation.
	 * @param dataLocation the dataLocation value you wish to set
	 */
	void setDataLocations(final Set<DataLocation> dataLocation);

    /**
     * Return the value associated with the column: id.
	 * @return A String object (this.id)
	 */
	String getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final String id);

    /**
     * Return the value associated with the column: repositoryName.
	 * @return A String object (this.repositoryName)
	 */
	String getRepositoryName();
	

  
    /**  
     * Set the value related to the column: repositoryName.
	 * @param repositoryName the repositoryName value you wish to set
	 */
	void setRepositoryName(final String repositoryName);

    /**
     * Return the value associated with the column: softwareType.
	 * @return A String object (this.softwareType)
	 */
	String getSoftwareType();
	

  
    /**  
     * Set the value related to the column: softwareType.
	 * @param softwareType the softwareType value you wish to set
	 */
	void setSoftwareType(final String softwareType);

	// end of interface
}