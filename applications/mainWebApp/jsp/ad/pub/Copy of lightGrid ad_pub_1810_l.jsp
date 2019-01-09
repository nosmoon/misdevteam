<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%  
	
	AD_PUB_1810_LDataSet ds = (AD_PUB_1810_LDataSet)request.getAttribute("ds");
	
	if(ds.curlist.size() > 0){
	    //RwText ��ü ����
		RwText rt = new RwText();
		try	{		
			
			//���۸� ��� ����
			rt.setBuffering(true);
		
			//��� �� ���� ����
			rt.setRowCnt(-1);
			rt.setColCnt(29);
			
			//ĸ�� ����
			//--------------�̺κ��� ������ ������ �ָ� �˴ϴ�----------------//
			rt.setCaption("����^������^hidden_pubc_slip_no^��ǥ��ȣ^��ü^�����ָ�^��^��^CM^��^����^�ܰ�^�����^�ΰ���^�̼��Ѿ�^������^�����^�����^������^���^���^���Ǹ�^����^����^�׷��^���ڰ�꼭^������^���緮^side_cd|����^������^hidden_pubc_slip_no^��ǥ��ȣ^��ü^�����ָ�^��^��^CM^��^����^�ܰ�^�����^�ΰ���^�̼��Ѿ�^������^�����^�����^������^����^����^���Ǹ�^����^����^�׷��^���ڰ�꼭^������^���緮^side_cd");
			
			//"��꼭����^������^��ǥ��ȣ^��ü^�����^���Ǻз�^���Ǹ�^�������^�������^������^�����^�����^�ΰ���^�Ա��Ѿ�^�̼��Ѿ�^�����^���ڼ��ݼ�����^T/B^SIDE_CD"  ==>19 OLD
			
			//"��꼭����^������^��ǥ��ȣ^��ü^�������^�������^�����ָ�^�����^�ΰ���^�̼��Ѿ�^�����^�����^���緮^��^CM^��^��^���Ǹ�^T/B^����^��ü�ڵ�^���ڼ��ݰ�꼭^side_cd"  ==> 23 NEW
			
			//"����^������^��ǥ��ȣ^��ü^�����ָ�^��^��^CM^��^����^�ܰ�^�����^�ΰ���^�̼��Ѿ�^������^�����^�����^������^���^���^���Ǹ�^����^����^�׷��^���ڰ�꼭^������^���緮^side_cd""  ==>28 NEW_NEW
			
			//�� ���� ����
			rt.setColWidth("33, 70, 110, 100, 45, 140, 50, 50, 50, 50, 60, 75, 100, 100, 100, 100, 100, 100, 100, 60, 60, 70, 70, 100, 100, 39, 100, 55, 33");
			
			//Column type �� style ����
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","visibility:hidden;");//��ǥ��ȣ_hidden(000-00000000-0000)
			rt.addColumn("output","");//��ǥ��ȣ_visiable(00000000-0000)
			rt.addColumn("output","");
			
			rt.addColumn("output","");			
			rt.addColumn("output","padding-right:16; background-position:center right;"); //�����
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
			
			rt.addColumn("output","visibility:hidden;");//���ڰ�꼭 
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","visibility:hidden;"); //SIDE_CD
		    
			rt.setColumn();
			out.print(rt.textFlush());
	
			long   tot_advt_fee     = 0;
			long   tot_vat          = 0;
			long   tot_misu_amt     = 0;
			long   tot_fee          = 0;
			double tot_pubc         = 0.00d;
					
			for(int i = 0; i < ds.curlist.size(); i++) {
				AD_PUB_1810_LCURLISTRecord rec = (AD_PUB_1810_LCURLISTRecord)ds.curlist.get(i);
											
				rt.addColValue(rec.sale_stmt_issu_yn, "");	//����
				rt.addColValue(rec.pubc_dt,"");				//������
				rt.addColValue(rec.pubc_slip_no,"");		//��ǥ��ȣ_hidden
				rt.addColValue(rec.pubc_slip_no.substring(3,15),"");		//��ǥ��ȣ
				rt.addColValue(rec.medi_nm,"");				//��ü
				
				rt.addColValue(rec.dlco_nm,"");				//�����ָ�
				rt.addColValue(rec.sect_cd + (StringUtil.toNumber(rec.sect_seq) < 10 ? " " + rec.sect_seq : rec.sect_seq ),"");	//��
				rt.addColValue(StringUtil.toDouble(rec.dn),"");		//��
				rt.addColValue(StringUtil.toDouble(rec.cm),"");		//CM
				rt.addColValue(rec.arow,"");						//��
				
				rt.addColValue(rec.chro_clsf,"");					//����
				rt.addColValue(rec.uprc,"");						//�ܰ�
				rt.addColValue(rec.advt_fee,"");					//�����
				rt.addColValue(rec.vat,"");							//�ΰ���
				rt.addColValue(rec.misu_tot_amt,"");				//�̼��Ѿ�
				
				rt.addColValue(rec.agn,"");							//������
				rt.addColValue(rec.fee,"");							//�����
				rt.addColValue(rec.hndl_plac_nm,"");				//�����
				rt.addColValue(rec.coms,"");						//������
				rt.addColValue(rec.slcrg_nm,"");					//�������
				
				rt.addColValue(rec.mchrg_nm,"");					//�������
				rt.addColValue(rec.sect_nm,"");						//���Ǹ�
				rt.addColValue(rec.pubc_clsf_nm,"");				//����
				rt.addColValue(rec.indt_clsf+" "+rec.indt_clsf_nm,"");//����
				rt.addColValue(rec.grp_cmpy_nm,"");					//�׷��
				
				rt.addColValue(rec.elec_tax_stmt_yn, "");			//���ڰ�꼭
				rt.addColValue(rec.advt_cont,"");					//������
				rt.addColValue(rec.pubc_cnt,"");					//���緮
				rt.addRowValue(rec.side_cd,"");						//side_cd

	
				tot_advt_fee += StringUtil.toNumber(rec.advt_fee);  
				tot_vat      += StringUtil.toNumber(rec.vat);
				tot_misu_amt += StringUtil.toNumber(rec.misu_tot_amt);
				tot_fee      += StringUtil.toNumber(rec.fee);
				tot_pubc     += StringUtil.toNumber(rec.pubc_cnt);
				
			}		
			
			rt.addColValue("","");		//����
			rt.addColValue("","");		//������
			rt.addColValue("","");		//��ǥ��ȣ_hidden
			rt.addColValue("","");		//��ǥ��ȣ
			rt.addColValue("","");		//��ü
			
			rt.addColValue("","");		//�����ָ�
			rt.addColValue("","");		//��
			rt.addColValue("","");		//��
			rt.addColValue("","");		//CM
			rt.addColValue("","");		//��
			
			rt.addColValue("","");		//����
			rt.addColValue("","");		//�ܰ�
			rt.addColValue(tot_advt_fee,"");		//�����
			rt.addColValue(tot_vat,"");				//�ΰ���
			rt.addColValue(tot_misu_amt,"");		//�̼��Ѿ�
			
			rt.addColValue("","");		//������
			rt.addColValue(tot_fee,"");		//�����
			rt.addColValue("","");		//�����
			rt.addColValue("","");		//������
			rt.addColValue("","");		//�������
			
			rt.addColValue("","");		//�������
			rt.addColValue("","");		//���Ǹ�
			rt.addColValue("","");		//����
			rt.addColValue("","");		//����
			rt.addColValue("","");		//�׷��
			
			rt.addColValue("","");		//���ڰ�꼭
			rt.addColValue(tot_pubc,"");		//������
			rt.addColValue("","");				//���緮
			rt.addRowValue("","");				//side_cd
			
			out.println(rt.textFlush()); //���� ���
		}catch(Exception e){
			System.out.println("e.......... : " + e.getMessage());
		}
	}
	
%>
