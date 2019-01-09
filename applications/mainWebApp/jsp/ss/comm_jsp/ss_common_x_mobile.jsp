<%---------------------------------------------------------------------------------------------------
* file name : ss_common_x.jsp
* function : common module for common code under TrustForm
* new date : 2016-07-11
* writer : jangsunhee
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* update_info :
* updater :
* update date :
* backup file name :
---------------------------------------------------------------------------------------------------%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
		java.text.*,
		java.math.*,
		javax.ejb.*,
		javax.servlet.jsp.*,
		somo.framework.db.*,
		somo.framework.expt.*,
		somo.framework.log.*,		
		somo.framework.prop.*,
		somo.framework.servlet.*,
		somo.framework.lib.*,
        somo.framework.util.*,
		chosun.ciis.ss.sls.common.ds.*,
		chosun.ciis.ss.sls.common.rec.*,
		chosun.ciis.ss.sls.common.dm.*,
		chosun.ciis.ss.sls.brinfo.ds.*,
		chosun.ciis.ss.sls.brinfo.rec.*,
		chosun.ciis.ss.sls.brinfo.dm.*,
		chosun.ciis.ss.sls.rdr.ds.*,
		chosun.ciis.ss.sls.rdr.rec.*,
		chosun.ciis.ss.sls.rdr.dm.*,
		chosun.ciis.ss.sls.extn.ds.*,
		chosun.ciis.ss.sls.extn.rec.*,
		chosun.ciis.ss.sls.extn.dm.*,
		chosun.ciis.ss.sls.move.ds.*,
		chosun.ciis.ss.sls.move.rec.*,
		chosun.ciis.ss.sls.move.dm.*,
		chosun.ciis.ss.sls.brsup.ds.*,
		chosun.ciis.ss.sls.brsup.rec.*,
		chosun.ciis.ss.sls.brsup.dm.*,
		chosun.ciis.ss.sls.brmgr.ds.*,
		chosun.ciis.ss.sls.brmgr.rec.*,
		chosun.ciis.ss.sls.brmgr.dm.*,
		chosun.ciis.ss.sls.share.ds.*,
		chosun.ciis.ss.sls.share.rec.*,
		chosun.ciis.ss.sls.share.dm.*,
		chosun.ciis.ss.sls.admin.ds.*,
		chosun.ciis.ss.sls.admin.rec.*,
		chosun.ciis.ss.sls.admin.dm.*,
		chosun.ciis.ss.sal.rdr.ds.*,
		chosun.ciis.ss.sal.rdr.rec.*,
		chosun.ciis.ss.sal.rdr.dm.*,
		chosun.ciis.ss.sls.cns.ds.*,
		chosun.ciis.ss.sls.cns.rec.*,
		chosun.ciis.ss.sls.cns.dm.*,
		chosun.ciis.ss.sls.ca.ds.*,
		chosun.ciis.ss.sls.ca.rec.*,
		chosun.ciis.ss.sls.ca.dm.*,
		chosun.ciis.ss.sal.common.ds.*,
		chosun.ciis.ss.sal.common.dm.*,
		chosun.ciis.ss.sal.common.rec.*,
        com.ksnet.card.*,
        kr.co.comsquare.rwXmlLib.*,
        chosun.ciis.co.lib.xi.RwXmlWrapper,

"%>
