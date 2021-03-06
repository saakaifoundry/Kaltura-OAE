package com.kaltura.client.services;

import org.w3c.dom.Element;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.KalturaClient;
import com.kaltura.client.KalturaObjectFactory;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaServiceBase;
import com.kaltura.client.utils.XmlUtils;
import com.kaltura.client.enums.*;
import com.kaltura.client.types.*;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import com.kaltura.client.KalturaFiles;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sun, 19 Jun 11 02:46:50 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class KalturaStorageProfileService extends KalturaServiceBase {
    public KalturaStorageProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaStorageProfileListResponse listByPartner() throws KalturaApiException {
        return this.listByPartner(null);
    }

    public KalturaStorageProfileListResponse listByPartner(KalturaPartnerFilter filter) throws KalturaApiException {
        return this.listByPartner(filter, null);
    }

    public KalturaStorageProfileListResponse listByPartner(KalturaPartnerFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        if (filter != null) kparams.add("filter", filter.toParams());
        if (pager != null) kparams.add("pager", pager.toParams());
        this.kalturaClient.queueServiceCall("storageprofile_storageprofile", "listByPartner", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return (KalturaStorageProfileListResponse)KalturaObjectFactory.create(resultXmlElement);
    }

    public void updateStatus(int storageId, KalturaStorageProfileStatus status) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.addIntIfNotNull("storageId", storageId);
        kparams.addIntIfNotNull("status", status.getHashCode());
        this.kalturaClient.queueServiceCall("storageprofile_storageprofile", "updateStatus", kparams);
        if (this.kalturaClient.isMultiRequest())
            return;
        Element resultXmlElement = this.kalturaClient.doQueue();
    }

    public KalturaStorageProfile get(int storageProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.addIntIfNotNull("storageProfileId", storageProfileId);
        this.kalturaClient.queueServiceCall("storageprofile_storageprofile", "get", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return (KalturaStorageProfile)KalturaObjectFactory.create(resultXmlElement);
    }

    public KalturaStorageProfile update(int storageProfileId, KalturaStorageProfile storageProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.addIntIfNotNull("storageProfileId", storageProfileId);
        if (storageProfile != null) kparams.add("storageProfile", storageProfile.toParams());
        this.kalturaClient.queueServiceCall("storageprofile_storageprofile", "update", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return (KalturaStorageProfile)KalturaObjectFactory.create(resultXmlElement);
    }

    public KalturaStorageProfile add(KalturaStorageProfile storageProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        if (storageProfile != null) kparams.add("storageProfile", storageProfile.toParams());
        this.kalturaClient.queueServiceCall("storageprofile_storageprofile", "add", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return (KalturaStorageProfile)KalturaObjectFactory.create(resultXmlElement);
    }
}
