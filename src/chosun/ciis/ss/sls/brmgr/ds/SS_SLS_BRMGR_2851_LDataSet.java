/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2851_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList clamtratelist = new ArrayList();
	public ArrayList medipricelist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long avg_clamt;
	public long avg_subsuprc;

	public SS_SLS_BRMGR_2851_LDataSet(){}
	public SS_SLS_BRMGR_2851_LDataSet(String errcode, String errmsg, long avg_clamt, long avg_subsuprc){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.avg_clamt = avg_clamt;
		this.avg_subsuprc = avg_subsuprc;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAvg_clamt(long avg_clamt){
		this.avg_clamt = avg_clamt;
	}

	public void setAvg_subsuprc(long avg_subsuprc){
		this.avg_subsuprc = avg_subsuprc;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getAvg_clamt(){
		return this.avg_clamt;
	}

	public long getAvg_subsuprc(){
		return this.avg_subsuprc;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.avg_clamt = cstmt.getLong(11);
		this.avg_subsuprc = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_SLS_BRMGR_2851_LCURLISTRecord rec = new SS_SLS_BRMGR_2851_LCURLISTRecord();
			rec.basiyymm = Util.checkString(rset0.getString("basiyymm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.valcnt = Util.checkString(rset0.getString("valcnt"));
			rec.aftcnt1 = Util.checkString(rset0.getString("aftcnt1"));
			rec.aftcnt2 = Util.checkString(rset0.getString("aftcnt2"));
			rec.aftcnt3 = Util.checkString(rset0.getString("aftcnt3"));
			rec.aftcnt4 = Util.checkString(rset0.getString("aftcnt4"));
			rec.aftcnt5 = Util.checkString(rset0.getString("aftcnt5"));
			rec.aftcnt6 = Util.checkString(rset0.getString("aftcnt6"));
			rec.sumvalcnt = Util.checkString(rset0.getString("sumvalcnt"));
			rec.excsaftcnt7 = Util.checkString(rset0.getString("excsaftcnt7"));
			rec.free_misu = Util.checkString(rset0.getString("free_misu"));
			rec.free_disc = Util.checkString(rset0.getString("free_disc"));
			rec.sumnocnt = Util.checkString(rset0.getString("sumnocnt"));
			rec.resv1 = Util.checkString(rset0.getString("resv1"));
			rec.resv2 = Util.checkString(rset0.getString("resv2"));
			rec.resv3 = Util.checkString(rset0.getString("resv3"));
			rec.totcnt = Util.checkString(rset0.getString("totcnt"));
			rec.thmmsendqty = Util.checkString(rset0.getString("thmmsendqty"));
			rec.per = Util.checkString(rset0.getString("per"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.valqty = Util.checkString(rset0.getString("valqty"));
			rec.valqty1 = Util.checkString(rset0.getString("valqty1"));
			rec.valqty2 = Util.checkString(rset0.getString("valqty2"));
			rec.valqty3 = Util.checkString(rset0.getString("valqty3"));
			rec.valqty4 = Util.checkString(rset0.getString("valqty4"));
			rec.valqty5 = Util.checkString(rset0.getString("valqty5"));
			rec.valqty6 = Util.checkString(rset0.getString("valqty6"));
			rec.sumvalqty = Util.checkString(rset0.getString("sumvalqty"));
			rec.valqty7 = Util.checkString(rset0.getString("valqty7"));
			rec.dueqty = Util.checkString(rset0.getString("dueqty"));
			rec.noqty = Util.checkString(rset0.getString("noqty"));
			rec.sumnoqty = Util.checkString(rset0.getString("sumnoqty"));
			rec.totqty = Util.checkString(rset0.getString("totqty"));
			rec.misissuqty = Util.checkString(rset0.getString("misissuqty"));
			rec.rptqty = Util.checkString(rset0.getString("rptqty"));
			rec.abcrate = Util.checkString(rset0.getString("abcrate"));
			rec.bef_amt = Util.checkString(rset0.getString("bef_amt"));
			rec.aft_amt = Util.checkString(rset0.getString("aft_amt"));
			rec.inc_amt = Util.checkString(rset0.getString("inc_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord rec = new SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.subsuprc = Util.checkString(rset1.getString("subsuprc"));
			rec.subsqty = Util.checkString(rset1.getString("subsqty"));
			this.medipricelist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord rec = new SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord();
			rec.mm = Util.checkString(rset2.getString("mm"));
			rec.gr_clm_2 = Util.checkString(rset2.getString("gr_clm_2"));
			rec.gr_clm_2_rt = Util.checkString(rset2.getString("gr_clm_2_rt"));
			rec.at_clm_2 = Util.checkString(rset2.getString("at_clm_2"));
			rec.at_clm_2_rt = Util.checkString(rset2.getString("at_clm_2_rt"));
			rec.ti_clm_2 = Util.checkString(rset2.getString("ti_clm_2"));
			rec.ti_clm_2_rt = Util.checkString(rset2.getString("ti_clm_2_rt"));
			rec.bm_clm_2 = Util.checkString(rset2.getString("bm_clm_2"));
			rec.bm_clm_2_rt = Util.checkString(rset2.getString("bm_clm_2_rt"));
			rec.gr_clm_1 = Util.checkString(rset2.getString("gr_clm_1"));
			rec.gr_clm_1_rt = Util.checkString(rset2.getString("gr_clm_1_rt"));
			rec.at_clm_1 = Util.checkString(rset2.getString("at_clm_1"));
			rec.at_clm_1_rt = Util.checkString(rset2.getString("at_clm_1_rt"));
			rec.ti_clm_1 = Util.checkString(rset2.getString("ti_clm_1"));
			rec.ti_clm_1_rt = Util.checkString(rset2.getString("ti_clm_1_rt"));
			rec.bm_clm_1 = Util.checkString(rset2.getString("bm_clm_1"));
			rec.bm_clm_1_rt = Util.checkString(rset2.getString("bm_clm_1_rt"));
			rec.gr_clm = Util.checkString(rset2.getString("gr_clm"));
			rec.gr_clm_rt = Util.checkString(rset2.getString("gr_clm_rt"));
			rec.at_clm = Util.checkString(rset2.getString("at_clm"));
			rec.at_clm_rt = Util.checkString(rset2.getString("at_clm_rt"));
			rec.ti_clm = Util.checkString(rset2.getString("ti_clm"));
			rec.ti_clm_rt = Util.checkString(rset2.getString("ti_clm_rt"));
			rec.bm_clm = Util.checkString(rset2.getString("bm_clm"));
			rec.bm_clm_rt = Util.checkString(rset2.getString("bm_clm_rt"));
			this.clamtratelist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2851_LDataSet ds = (SS_SLS_BRMGR_2851_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SS_SLS_BRMGR_2851_LCURLISTRecord curlistRec = (SS_SLS_BRMGR_2851_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medipricelist.size(); i++){
		SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord medipricelistRec = (SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord)ds.medipricelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtratelist.size(); i++){
		SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord clamtratelistRec = (SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord)ds.clamtratelist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAvg_clamt()%>
<%= ds.getAvg_subsuprc()%>
<%= ds.getCurlist()%>
<%= ds.getMedipricelist()%>
<%= ds.getClamtratelist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.basiyymm%>
<%= curlistRec.medicd%>
<%= curlistRec.deptcd%>
<%= curlistRec.deptnm%>
<%= curlistRec.partcd%>
<%= curlistRec.partnm%>
<%= curlistRec.areacd%>
<%= curlistRec.areanm%>
<%= curlistRec.bocd%>
<%= curlistRec.bonm%>
<%= curlistRec.valcnt%>
<%= curlistRec.aftcnt1%>
<%= curlistRec.aftcnt2%>
<%= curlistRec.aftcnt3%>
<%= curlistRec.aftcnt4%>
<%= curlistRec.aftcnt5%>
<%= curlistRec.aftcnt6%>
<%= curlistRec.sumvalcnt%>
<%= curlistRec.excsaftcnt7%>
<%= curlistRec.free_misu%>
<%= curlistRec.free_disc%>
<%= curlistRec.sumnocnt%>
<%= curlistRec.resv1%>
<%= curlistRec.resv2%>
<%= curlistRec.resv3%>
<%= curlistRec.totcnt%>
<%= curlistRec.thmmsendqty%>
<%= curlistRec.per%>
<%= curlistRec.subsmappli%>
<%= curlistRec.valqty%>
<%= curlistRec.valqty1%>
<%= curlistRec.valqty2%>
<%= curlistRec.valqty3%>
<%= curlistRec.valqty4%>
<%= curlistRec.valqty5%>
<%= curlistRec.valqty6%>
<%= curlistRec.sumvalqty%>
<%= curlistRec.valqty7%>
<%= curlistRec.dueqty%>
<%= curlistRec.noqty%>
<%= curlistRec.sumnoqty%>
<%= curlistRec.totqty%>
<%= curlistRec.misissuqty%>
<%= curlistRec.rptqty%>
<%= curlistRec.abcrate%>
<%= curlistRec.bef_amt%>
<%= curlistRec.aft_amt%>
<%= curlistRec.inc_amt%>
<%= medipricelistRec.bocd%>
<%= medipricelistRec.medicd%>
<%= medipricelistRec.subsuprc%>
<%= medipricelistRec.subsqty%>
<%= clamtratelistRec.mm%>
<%= clamtratelistRec.gr_clm_2%>
<%= clamtratelistRec.gr_clm_2_rt%>
<%= clamtratelistRec.at_clm_2%>
<%= clamtratelistRec.at_clm_2_rt%>
<%= clamtratelistRec.ti_clm_2%>
<%= clamtratelistRec.ti_clm_2_rt%>
<%= clamtratelistRec.bm_clm_2%>
<%= clamtratelistRec.bm_clm_2_rt%>
<%= clamtratelistRec.gr_clm_1%>
<%= clamtratelistRec.gr_clm_1_rt%>
<%= clamtratelistRec.at_clm_1%>
<%= clamtratelistRec.at_clm_1_rt%>
<%= clamtratelistRec.ti_clm_1%>
<%= clamtratelistRec.ti_clm_1_rt%>
<%= clamtratelistRec.bm_clm_1%>
<%= clamtratelistRec.bm_clm_1_rt%>
<%= clamtratelistRec.gr_clm%>
<%= clamtratelistRec.gr_clm_rt%>
<%= clamtratelistRec.at_clm%>
<%= clamtratelistRec.at_clm_rt%>
<%= clamtratelistRec.ti_clm%>
<%= clamtratelistRec.ti_clm_rt%>
<%= clamtratelistRec.bm_clm%>
<%= clamtratelistRec.bm_clm_rt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 27 17:01:31 KST 2018 */