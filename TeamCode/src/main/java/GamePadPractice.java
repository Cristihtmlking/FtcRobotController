import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    double speedVariable=-gamepad1.left_stick_y/2.0;
    double difference=gamepad1.left_stick_x-gamepad1.right_stick_x;
   @Override
    public void init(){

    }
    @Override
    public  void loop(){
    telemetry.addData("lx",gamepad1.left_stick_x);
    telemetry.addData("a",gamepad1.a);
    telemetry.addData("b",gamepad1.b);
    telemetry.addData("ly",speedVariable);
    telemetry.addData("ry", gamepad1.right_stick_y);
    telemetry.addData("rx", gamepad1.right_stick_x);
    telemetry.addData("Difference", difference);
   }
}

