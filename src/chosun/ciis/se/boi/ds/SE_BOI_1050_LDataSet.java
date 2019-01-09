/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� : ���������߰�
* ������ : �弱��
* �������� : 2017-09-26
* ��� :
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 *
 */


public class SE_BOI_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList boempcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1050_LDataSet(){}
	public SE_BOI_1050_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_BOI_1050_LBOEMPCURRecord rec = new SE_BOI_1050_LBOEMPCURRecord();
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.lv_cmpy_dt = Util.checkString(rset0.getString("lv_cmpy_dt"));
			rec.delyn = Util.checkString(rset0.getString("delyn"));
			this.boempcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_1050_LDataSet ds = (SE_BOI_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.boempcur.size(); i++){
		SE_BOI_1050_LBOEMPCURRecord boempcurRec = (SE_BOI_1050_LBOEMPCURRecord)ds.boempcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBoempcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= boempcurRec.boemp_no%>
<%= boempcurRec.flnm%>
<%= boempcurRec.prn%>
<%= boempcurRec.dutynm%>
<%= boempcurRec.tel_no%>
<%= boempcurRec.ptph_no%>
<%= boempcurRec.in_cmpy_dt%>
<%= boempcurRec.lv_cmpy_dt%>
<%= boempcurRec.delyn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 27 11:16:50 KST 2017 */