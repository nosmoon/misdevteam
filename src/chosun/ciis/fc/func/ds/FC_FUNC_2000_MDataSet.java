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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_2000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_ygcompgbcd = new ArrayList();
	public ArrayList curdrcr_ygyugagbcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_2000_MDataSet(){}
	public FC_FUNC_2000_MDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			FC_FUNC_2000_MCURDRCR_YGYUGAGBCDRecord rec = new FC_FUNC_2000_MCURDRCR_YGYUGAGBCDRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curdrcr_ygyugagbcd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			FC_FUNC_2000_MCURDRCR_YGCOMPGBCDRecord rec = new FC_FUNC_2000_MCURDRCR_YGCOMPGBCDRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curdrcr_ygcompgbcd.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_2000_MDataSet ds = (FC_FUNC_2000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curdrcr_ygyugagbcd.size(); i++){
		FC_FUNC_2000_MCURDRCR_YGYUGAGBCDRecord curdrcr_ygyugagbcdRec = (FC_FUNC_2000_MCURDRCR_YGYUGAGBCDRecord)ds.curdrcr_ygyugagbcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_ygcompgbcd.size(); i++){
		FC_FUNC_2000_MCURDRCR_YGCOMPGBCDRecord curdrcr_ygcompgbcdRec = (FC_FUNC_2000_MCURDRCR_YGCOMPGBCDRecord)ds.curdrcr_ygcompgbcd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_ygyugagbcd()%>
<%= ds.getCurdrcr_ygcompgbcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curdrcr_ygyugagbcdRec.cd%>
<%= curdrcr_ygyugagbcdRec.cdnm%>
<%= curdrcr_ygyugagbcdRec.cd_abrv_nm%>
<%= curdrcr_ygyugagbcdRec.cdnm_cd%>
<%= curdrcr_ygyugagbcdRec.cdabrvnm_cd%>
<%= curdrcr_ygcompgbcdRec.cd%>
<%= curdrcr_ygcompgbcdRec.cdnm%>
<%= curdrcr_ygcompgbcdRec.cd_abrv_nm%>
<%= curdrcr_ygcompgbcdRec.cdnm_cd%>
<%= curdrcr_ygcompgbcdRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 10 14:08:43 KST 2009 */