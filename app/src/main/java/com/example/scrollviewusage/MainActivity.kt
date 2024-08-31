package com.example.scrollviewusage

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.scrollviewusage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var articleNum = 0
        val maxArticle = articles.size - 1
        val minArticle = 0

        binding.reader.text = articles[articleNum]
        binding.loc.text = "${articleNum + 1}/${maxArticle + 1}"


        binding.btnRight.setOnClickListener {
            if (maxArticle > articleNum) {
                articleNum += 1
                binding.reader.text = articles[articleNum]
                binding.loc.text = "${articleNum + 1}/${maxArticle + 1}"
            } else {
                articleNum = minArticle
                binding.reader.text = articles[articleNum]
                binding.loc.text = "${articleNum + 1}/${maxArticle + 1}"
                Toast.makeText(this, "Last article reached..", Toast.LENGTH_SHORT).show()
            }

        }
        binding.btnLeft.setOnClickListener {
            if (minArticle < articleNum) {
                articleNum -= 1
                binding.reader.text = articles[articleNum]
                binding.loc.text = "${articleNum + 1}/${maxArticle + 1}"

            } else {
                articleNum = maxArticle
                binding.reader.text = articles[articleNum]
                binding.loc.text = "${articleNum + 1}/${maxArticle + 1}"
                Toast.makeText(this, "First article reached..", Toast.LENGTH_SHORT).show()
            }


        }

        binding.themeSwith.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                binding.themeMode.text = "Dark Mode"
                binding.reader.setTextColor(Color.parseColor("#ffffff"))
                binding.themeMode.setTextColor(Color.parseColor("#ffffff"))
                binding.viewScroll.setBackgroundColor(Color.parseColor("#212121"))
                binding.titleBar.setBackgroundColor(Color.parseColor("#263238"))
                binding.navBar.setBackgroundColor(Color.parseColor("#263238"))
            } else {
                binding.themeMode.text = "Light Mode"
                binding.reader.setTextColor(Color.parseColor("#000000"))
                binding.themeMode.setTextColor(Color.parseColor("#000000"))
                binding.viewScroll.setBackgroundColor(Color.parseColor("#FAFAFA"))
                binding.titleBar.setBackgroundColor(Color.parseColor("#B0BEC5"))
                binding.navBar.setBackgroundColor(Color.parseColor("#B0BEC5"))
            }
        }


    }


    private val articles = listOf(
        "The word robot can refer to both physical robots and virtual software agents, but the latter are usually referred to as bots.[11] There is no consensus on which machines qualify as robots but there is general agreement among experts, and the public, that robots tend to possess some or all of the following abilities and functions: accept electronic programming, process data or physical perceptions electronically, operate autonomously to some degree, move around, operate physical parts of itself or physical processes, sense and manipulate their environment, and exhibit intelligent behavior, especially behavior which mimics humans or other animals.[12][13] Related to the concept of a robot is the field of synthetic biology, which studies entities whose nature is more comparable to living things than to machines",
        "There are three types of muscle tissue in vertebrates: skeletal, cardiac, and smooth. Skeletal and cardiac muscle are types of striated muscle tissue.[2] Smooth muscle is non–striated. There are three types of muscle tissue in invertebrates that are based on their pattern of striation: transversely striated, obliquely striated, and smooth muscle. In arthropods there is no smooth muscle. The transversely striated type is the most similar to the skeletal muscle in vertebrates.[4] Vertebrate skeletal muscle tissue is an elongated, striated muscle tissue, with the fibres ranging from 3–8 micrometers in width and from 18 to 200 micrometers in breadth. In the uterine wall, during pregnancy, they enlarge in length from 70 to 500 micrometers.[5] Skeletal striated muscle tissue is arranged in regular, parallel bundles of myofibrils, which contain many contractile units known as sarcomeres, which give the tissue its striated (striped) appearance. Skeletal muscle is voluntary muscle, anchored by tendons or sometimes by aponeuroses to bones, and is used to effect skeletal movement such as locomotion and to maintain posture. Postural control is generally maintained as an unconscious reflex, but the responsible muscles can also react to conscious control. The body mass of an average adult man is made up of 42% of skeletal muscle, and an average adult woman is made up of 36%.[6] Cardiac muscle tissue is found only in the walls of the heart as myocardium, and it is an involuntary muscle controlled by the autonomic nervous system. Cardiac muscle tissue is striated like skeletal muscle, containing sarcomeres in highly regular arrangements of bundles. While skeletal muscles are arranged in regular, parallel bundles, cardiac muscle connects at branching, irregular angles known as intercalated discs. Smooth muscle tissue is non-striated and involuntary. Smooth muscle is found within the walls of organs and structures such as the esophagus, stomach, intestines, bronchi, uterus, urethra, bladder, blood vessels, and the arrector pili in the skin that control the erection of body hair.",
        "A skeleton is the structural frame that supports the body of most animals. There are several types of skeletons, including the exoskeleton, which is a rigid outer shell that holds up an organism\\'s shape; the endoskeleton, a rigid internal frame to which the organs and soft tissues attach; and the hydroskeleton, a flexible internal structure supported by the hydrostatic pressure of body fluids. Vertebrates are animals with an endoskeleton centered around an axial vertebral column, and their skeletons are typically composed of bones and cartilages. Invertebrates are other animals that lack a vertebral column, and their skeletons vary, including hard-shelled exoskeleton (arthropods and most molluscs), plated internal shells (e.g. cuttlebones in some cephalopods) or rods (e.g. ossicles in echinoderms), hydrostatically supported body cavities (most), and spicules (sponges). Cartilage is a rigid connective tissue that is found in the skeletal systems of vertebrates and invertebrates.",
        "Native Americans There are a number of references to traditional, ancient, or prehistoric ball games, played by indigenous peoples in many different parts of the world. For example, in 1586, men from a ship commanded by an English explorer named John Davis went ashore to play a form of football with Inuit in Greenland.[32] There are later accounts of an Inuit game played on ice, called Aqsaqtuk. Each match began with two teams facing each other in parallel lines, before attempting to kick the ball through each other team's line and then at a goal. In 1610, William Strachey, a colonist at Jamestown, Virginia recorded a game played by Native Americans, called Pahsaheman.[citation needed] Pasuckuakohowog, a game similar to modern-day association football played amongst Amerindians, was also reported as early as the 17th century. Games played in Mesoamerica with rubber balls by indigenous peoples are also well-documented as existing since before this time, but these had more similarities to basketball or volleyball, and no links have been found between such games and modern football sports. Northeastern American Indians, especially the Iroquois Confederation, played a game which made use of net racquets to throw and catch a small ball; however, although it is a ball-goal foot game, lacrosse (as its modern descendant is called) is likewise not usually classed as a form of \"football\".[citation needed] On the Australian continent several tribes of indigenous people played kicking and catching games with stuffed balls which have been generalised by historians as Marn Grook (Djab Wurrung for \"game ball\"). The earliest historical account is an anecdote from the 1878 book by Robert Brough-Smyth, The Aborigines of Victoria, in which a man called Richard Thomas is quoted as saying, in about 1841 in Victoria, Australia, that he had witnessed Aboriginal people playing the game: \"Mr Thomas describes how the foremost player will drop kick a ball made from the skin of a possum and how other players leap into the air in order to catch it.\" Some historians have theorised that Marn Grook was one of the origins of Australian rules football. The Māori in New Zealand played a game called Kī-o-rahi consisting of teams of seven players play on a circular field divided into zones, and score points by touching the 'pou' (boundary markers) and hitting a central 'tupu' or target.[citation needed] These games and others may well go far back into antiquity. However, the main sources of modern football codes appear to lie in western Europe, especially England."
    )
}