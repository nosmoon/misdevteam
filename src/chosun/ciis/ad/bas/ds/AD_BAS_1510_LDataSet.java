/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public String rept_clsf;

	public AD_BAS_1510_LDataSet(){}
	public AD_BAS_1510_LDataSet(String errcode, String errmsg, long totalcnt, String rept_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.rept_clsf = rept_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totalcnt = cstmt.getLong(15);
		this.rept_clsf = Util.checkString(cstmt.getString(16));
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			AD_BAS_1510_LCURLISTRecord rec = new AD_BAS_1510_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.rept_clsf = Util.checkString(rset0.getString("rept_clsf"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.rept_no = rset0.getInt("rept_no");
			rec.advcs_clsf = Util.checkString(rset0.getString("advcs_clsf"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.patr_chrg_pers = Util.checkString(rset0.getString("patr_chrg_pers"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.cont = Util.checkString(rset0.getString("cont"));
			rec.taem_chf_opn = Util.checkString(rset0.getString("taem_chf_opn"));
			rec.team_chf_yn = Util.checkString(rset0.getString("team_chf_yn"));
			rec.hdqt_chf_yn = Util.checkString(rset0.getString("hdqt_chf_yn"));
			rec.add_file_no = Util.checkString(rset0.getString("add_file_no"));
			rec.add_file_nm = Util.checkString(rset0.getString("add_file_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_1510_LDataSet ds = (AD_BAS_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1510_LCURLISTRecord curlistRec = (AD_BAS_1510_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRept_clsf()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.rept_clsf%>
<%= curlistRec.make_dt%>
<%= curlistRec.rept_no%>
<%= curlistRec.advcs_clsf%>
<%= curlistRec.medi_clsf%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.dlco_no%>
<%= curlistRec.patr_chrg_pers%>
<%= curlistRec.titl%>
<%= curlistRec.cont%>
<%= curlistRec.taem_chf_opn%>
<%= curlistRec.team_chf_yn%>
<%= curlistRec.hdqt_chf_yn%>
<%= curlistRec.add_file_no%>
<%= curlistRec.add_file_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Oct 31 15:53:08 KST 2016 */