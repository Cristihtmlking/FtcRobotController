package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@Autonomous
public class TrainClass extends OpMode {
    @Override
    public void init(){
        String s = "\n\tMihai Eminescu\n" +
                "Criticilor mei\n" +
                "\n" +
                "Multe flori sunt, dar puține\n" +
                "Rod în lume o să poarte,\n" +
                "Toate bat la poarta vieții,\n" +
                "Dar se scutur multe moarte.\n" +
                "\n" +
                "E ușor a scrie versuri\n" +
                "Când nimic nu ai a spune,\n" +
                "Înșirând cuvinte goale\n" +
                "Ce din coadă au să sune.\n" +
                "\n" +
                "Dar când inima-ți frământă\n" +
                "Doruri vii și patimi multe,\n" +
                "Ș-a lor glasuri a ta minte\n" +
                "Stă pe toate să le-asculte,\n" +
                "\n" +
                "Ca și flori în poarta vieții\n" +
                "Bat la porțile gândirii,\n" +
                "Toate cer intrare-n lume,\n" +
                "Cer veștmintele vorbirii.\n" +
                "\n" +
                "Pentru-a tale proprii patimi,\n" +
                "Pentru propria-ți viață,\n" +
                "Unde ai judecătorii,\n" +
                "Ne'ndurații ochi de gheață?\n" +
                "\n" +
                "Ah! atuncea ți se pare\n" +
                "Că pe cap îți cade cerul:\n" +
                "Unde vei găsi cuvântul\n" +
                "Ce exprimă adevărul?\n" +
                "\n" +
                "Critici voi, cu flori deșerte,\n" +
                "Care roade n-ați adus -\n" +
                "E ușor a scrie versuri\n" +
                "Când nimic nu ai de spus.";
        telemetry.addData("Moment cultural", s);

    }
    @Override
    public void loop(){

    }
}
