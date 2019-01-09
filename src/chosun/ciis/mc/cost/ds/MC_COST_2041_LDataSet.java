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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_2041_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_2041_LDataSet(){}
	public MC_COST_2041_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MC_COST_2041_LCURLISTRecord rec = new MC_COST_2041_LCURLISTRecord();
			rec.intfce_yn = Util.checkString(rset0.getString("intfce_yn"));
			rec.cost_dstb_cd = Util.checkString(rset0.getString("cost_dstb_cd"));
			rec.cost_dstb_cdnm = Util.checkString(rset0.getString("cost_dstb_cdnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_cdnm = Util.checkString(rset0.getString("dept_cdnm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cdnm = Util.checkString(rset0.getString("medi_cdnm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.ratio1 = Util.checkString(rset0.getString("ratio1"));
			rec.ratio2 = Util.checkString(rset0.getString("ratio2"));
			rec.key_cost_dstb_cd = Util.checkString(rset0.getString("key_cost_dstb_cd"));
			rec.key_dept_cd = Util.checkString(rset0.getString("key_dept_cd"));
			rec.key_medi_cd = Util.checkString(rset0.getString("key_medi_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_2041_LDataSet ds = (MC_COST_2041_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_2041_LCURLISTRecord curlistRec = (MC_COST_2041_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.intfce_yn%>
<%= curlistRec.cost_dstb_cd%>
<%= curlistRec.cost_dstb_cdnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_cdnm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cdnm%>
<%= curlistRec.qunt%>
<%= curlistRec.ratio1%>
<%= curlistRec.ratio2%>
<%= curlistRec.key_cost_dstb_cd%>
<%= curlistRec.key_dept_cd%>
<%= curlistRec.key_medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 12 20:26:42 KST 2009 */